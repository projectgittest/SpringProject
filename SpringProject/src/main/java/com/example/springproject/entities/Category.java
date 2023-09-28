package com.example.springproject.entities;

public enum Category {
    BERLINA,
    SPORTIVA,
    SUV,
    MONOVOLUME,
    ;


    public static Category toEnum(String category){
        if(category.equals(Category.BERLINA.name())){
            return Category.BERLINA;
        } else if (category.equals(Category.SPORTIVA.name())) {
            return Category.SPORTIVA;
        }
       else if (category.equals(Category.SUV.name())) {
        return Category.SUV;
    }
        else if (category.equals(Category.MONOVOLUME.name())) {
        return Category.MONOVOLUME;
        }
      return null;
    }
}

