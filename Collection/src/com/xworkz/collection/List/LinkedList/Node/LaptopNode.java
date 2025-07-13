package com.xworkz.collection.List.LinkedList.Node;

import com.xworkz.collection.List.LinkedList.dto.LaptopDto;

public class LaptopNode {
    private LaptopDto laptopDto;
    private LaptopNode laptopNode;

    public LaptopNode(LaptopDto laptopDto,LaptopNode laptopNode){
        this.laptopDto=laptopDto;
        this.laptopNode=laptopNode;
    }

    public LaptopDto getLaptopDto() {
        return laptopDto;
    }

    public void setLaptopDto(LaptopDto laptopDto) {
        this.laptopDto = laptopDto;
    }

    public LaptopNode getLaptopNode() {
        return laptopNode;
    }

    public void setLaptopNode(LaptopNode laptopNode) {
        this.laptopNode = laptopNode;
    }
}
