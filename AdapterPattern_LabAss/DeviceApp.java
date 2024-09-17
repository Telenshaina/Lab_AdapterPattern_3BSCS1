public class DeviceApp {
    public static void main(String[] args){

         Laptop laptop = new Laptop();
         PowerOutlet laptopAd = new LaptopAdapter(laptop);

         Refrigerator refrigerator = new Refrigerator();
         PowerOutlet refAd = new RefrigeratorAdapter(refrigerator);

         SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
         PowerOutlet phoneAd = new SmartphoneAdapter(smartphoneCharger);

            System.out.println();
            System.out.println(laptopAd.plugIn());
            System.out.println(refAd.plugIn());
            System.out.println(phoneAd.plugIn());

    }
}
