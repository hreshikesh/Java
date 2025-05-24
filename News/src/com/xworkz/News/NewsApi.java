package com.xworkz.News;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/news")
public class NewsApi extends HttpServlet {

    private static final String API_KEY = "0930a7a714fd4b699dd1676f2b6e454b";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String query = request.getParameter("query");
        String page = request.getParameter("page");

        if (query == null || query.trim().isEmpty()) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("{\"error\":\"Missing or empty query parameter\"}");
            return;
        }

        if (page == null || page.trim().isEmpty()) {
            page = "1"; // default to first page
        }

        // Build NewsAPI URL
        String newsApiUrl = "https://newsapi.org/v2/everything?"
                + "q=" + java.net.URLEncoder.encode(query, "UTF-8")
                + "&language=en"
                + "&sortBy=publishedAt"
                + "&page=" + page
                + "&pageSize=20" // 20 articles per page
                + "&apiKey=" + API_KEY;

        HttpURLConnection conn = null;
        BufferedReader reader = null;
        try {
            URL url = new URL(newsApiUrl);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int status = conn.getResponseCode();

            reader = new BufferedReader(new InputStreamReader(
                    status >= 200 && status < 300 ? conn.getInputStream() : conn.getErrorStream()));

            StringBuilder responseContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }

            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(responseContent.toString());

        } catch (Exception e) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write("{\"error\":\"" + e.getMessage() + "\"}");
        } finally {
            if (reader != null) reader.close();
            if (conn != null) conn.disconnect();
        }
    }
}
