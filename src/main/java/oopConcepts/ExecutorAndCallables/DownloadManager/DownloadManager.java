package oopConcepts.ExecutorAndCallables.DownloadManager;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DownloadManager {
    private ExecutorService executorService;

    public DownloadManager(int threadPoolSize){
        executorService = Executors.newFixedThreadPool(threadPoolSize);
    }

    public void downloadFiles(List<String> fileUrls) {
        for (String fileUrl : fileUrls) {
            DownloadTask downloadTask = new DownloadTask(fileUrl);
            executorService.submit(downloadTask);
        }
    }
    public void shutdown() {
        executorService.shutdown();
    }
}
