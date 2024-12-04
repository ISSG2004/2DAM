public class LanzadorConFIleLock {
    public static void main(String[] args) {
        ProcessBuilder pcb = new ProcessBuilder("java","-cp","bin","ConFileLock");
        for (int i = 0; i < 21; i++) {
            try {
                // Iniciar el proceso
                pcb.start();
                System.out.println("Proceso " + i + " ejecutado correctamente");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
