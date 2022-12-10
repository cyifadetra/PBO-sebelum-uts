package PBO_Sebelum_UTS;

public abstract class Parkir {

        String color;

        void setColor(String color){
            this.color = color;
        }

        String getColor(){
            return this.color;
        }

        abstract float getArea();
    }
