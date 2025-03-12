class Camera {
    String brand;       
    String lens;        
    int megapixels;     
    int price;          

    public static void main(String args[]) {
        Camera cam1=new Camera();
        cam1.brand="Canon";
        cam1.lens="24mm";
        cam1.megapixels=45;
        cam1.price=3900;
        System.out.println("Brand: " + cam1.brand + "Lens: " + cam1.lens + "Megapixels: " + cam1.megapixels + "MP, Price:" + cam1.price);

        Camera cam2=new Camera();
        cam2.brand="Nikon";
        cam2.lens="24mm";
        cam2.megapixels=46;
        cam2.price=5500;
        System.out.println("Brand: " + cam2.brand + "Lens: " + cam2.lens + "Megapixels: " + cam2.megapixels + "MP, Price:" + cam2.price);

        Camera cam3=new Camera();
        cam3.brand="Sony";
        cam3.lens="105mm";
        cam3.megapixels=33;
        cam3.price=2500;
        System.out.println("Brand: " + cam3.brand + "Lens: " + cam3.lens + "Megapixels: " + cam3.megapixels + "MP, Price:" + cam3.price);

        Camera cam4=new Camera();
        cam4.brand="Fujifilm";
        cam4.lens="55mm";
        cam4.megapixels=40;
        cam4.price=1700;
        System.out.println("Brand: " + cam4.brand + "Lens: " + cam4.lens + "Megapixels: " + cam4.megapixels + "MP, Price:" + cam4.price);

        Camera cam5=new Camera();
        cam5.brand="Olympus";
        cam5.lens="40mm";
        cam5.megapixels=20;
        cam5.price=1800;
        System.out.println("Brand: " + cam5.brand + "Lens: " + cam5.lens + "Megapixels: " + cam5.megapixels + "MP, Price:" + cam5.price);

        Camera cam6=new Camera();
        cam6.brand="Leica";
        cam6.lens="50mm";
        cam6.megapixels=47;
        cam6.price=5500;
        System.out.println("Brand: " + cam6.brand + "Lens: " + cam6.lens + "Megapixels: " + cam6.megapixels + "MP, Price:" + cam6.price);

        Camera cam7=new Camera();
        cam7.brand="Pentax";
        cam7.lens="70mm";
        cam7.megapixels=36;
        cam7.price=2000;
        System.out.println("Brand: " + cam7.brand + "Lens: " + cam7.lens + "Megapixels: " + cam7.megapixels + "MP, Price:" + cam7.price);

        Camera cam8=new Camera();
        cam8.brand="Panasonic";
        cam8.lens="70mm";
        cam8.megapixels=24;
        cam8.price=1700;
        System.out.println("Brand: " + cam8.brand + "Lens: " + cam8.lens + "Megapixels: " + cam8.megapixels + "MP, Price:" + cam8.price);

        Camera cam9=new Camera();
        cam9.brand="GoPro";
        cam9.lens="12mm";
        cam9.megapixels=27;
        cam9.price=500;
        System.out.println("Brand: " + cam9.brand + "Lens: " + cam9.lens + "Megapixels: " + cam9.megapixels + "MP, Price:" + cam9.price);

        Camera cam10=new Camera();
        cam10.brand="RandomBrand";
        cam10.lens="18mm";
        cam10.megapixels=12;
        cam10.price=300;
        System.out.println("Brand: " + cam10.brand + "Lens: " + cam10.lens + "Megapixels: " + cam10.megapixels + "MP, Price:" + cam10.price);
    }
}
