package com.dionedavid;

public class UserInput {
    private int budget;
    private String platform;
    private String purpose;
    private boolean needUps;
    private String connectionType;
    private String aesthetic;

    public UserInput(int budget, String platform, String purpose, boolean needUps, String connectionType, String aesthetic) {
        this.budget = budget;
        this.platform = platform;
        this.purpose = purpose;
        this.needUps = needUps;
        this.connectionType = connectionType;
        this.aesthetic = aesthetic;
        System.out.println("UserInput class instantiated.");
    }

}
