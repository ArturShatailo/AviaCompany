package com.example.aviacompany;

import java.util.ArrayList;

public class Menu {

    public int fields;
    public ArrayList<String> arrayMenu;

    public Menu(int fields, ArrayList<String> arrayMenu) {
        this.fields = fields;
        this.arrayMenu = arrayMenu;
    }

    public void menuBuilder(){
        for(int i=1; i<=this.fields; i++){
            System.out.println(i+") "+ this.arrayMenu.get(i-1));
        }

    }

}
