package oopConcepts.ExecutorAndCallables.DownloadManager;

class DownloadTask implements Runnable {
    private String fileUrl;
    public DownloadTask(String fileUrl) {
        this.fileUrl = fileUrl;
    }
    @Override
    public void run() {
// Simulate file download
        System.out.println("Downloading file from: " + fileUrl);
// Simulate download progress
        for (int progress = 0; progress <= 100; progress += 10) {
            System.out.println("Progress for " + fileUrl + ": " + progress + "%");
            try {
                Thread.sleep(500); // Simulate download time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Download complete for: " + fileUrl);
    }
}
