public class baiTap3 {

        public static void main(String[] args) {
            String version = System.getProperty("java.version");
            String runTimeVersion = System.getProperty("java.runtime.version");
            String home = System.getProperty("java.home");
            String vendor = System.getProperty("java.vm.vendor");
            String vendorRrl = System.getProperty("java.vendor.url");
            String classPath = System.getProperty("java.class.path");

            System.out.println("Java Version: " + version);
            System.out.println("Java Runtime Version: " + runTimeVersion);
            System.out.println("Java Home: " + home);
            System.out.println("Java Vendor: " + vendor);
            System.out.println("Java Vendor URL: " + vendorRrl);
            System.out.println("Java Class Path: " + classPath);
        }
}
