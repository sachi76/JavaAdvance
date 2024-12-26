package oopConcepts.ExecutorAndCallables.DownloadManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DownloadManager downloadManager = new DownloadManager(3);

        List<String> filesToDownload = List.of("file1", "file2", "file3", "file4",
                "file5");
        downloadManager.downloadFiles(filesToDownload);
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread is doing some work...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        downloadManager.shutdown();
    }
}
