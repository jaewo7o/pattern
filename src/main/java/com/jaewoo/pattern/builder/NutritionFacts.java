package com.jaewoo.pattern.builder;

public class NutritionFacts {
    private final int servingSize;                    // 필수
    private final int servings;                         // 필수
    private final int calories;                          // 선택
    private final int fat;                                  // 선택
    private final int sodium;                           // 선택
    private final int carbohydrate;                 // 선택
 
    @Override
    public String toString() {
        return "NutritionFacts [servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories + ", fat=" + fat + ", sodium=" + sodium + ", carbohydrate="
                + carbohydrate + "]";
    }

    public static class Builder {
        //    필수 인자
        private final int servingSize;
        private final int servings;    
        //    선택적 인자
        private int calories = 0;                    //기본값으로 초기화
        private int fat = 0;    
        private int sodium = 0;
        private int carbohydrate = 0;
 
        public Builder ( int servingSize, int servings ) {
            this.servingSize = servingSize;
            this.servings = servings;
        }
 
        public Builder calories( int val ) { 
            calories = val;
            return this;
        }
 
        public Builder fat( int val ) { 
            fat = val;
            return this;
        }
 
        public Builder sodium( int val ) { 
            sodium = val;
            return this;
        }
 
        public Builder carbohydrate( int val ) { 
            carbohydrate = val;
            return this;
        }
 
        public NutritionFacts build() {
            return new NutritionFacts( this );
        }
    }
 
    private NutritionFacts( Builder builder ) { 
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
}