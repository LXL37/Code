package designPattern.structuralPattern.facade;

import lombok.Data;

@Data
public class GiftInfo {
    private String name;

    public GiftInfo(String name) {
        this.name = name;
    }
}
