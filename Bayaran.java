package PBO_Sebelum_UTS;

    public class Bayaran extends Parkir {

        private float paarkir;

        public Bayaran(float paarkir) {
            this.paarkir = paarkir;
        }


        @Override
        float getArea() {
            return (float) (5000* paarkir);
        }

    }



