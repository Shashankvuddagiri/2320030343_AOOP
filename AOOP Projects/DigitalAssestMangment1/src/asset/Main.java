package asset;

public class Main {
    public static void main(String[] args) {
        AssetManager assetManager = new AssetManager();
        AssetStorage storage = new AssetStorage(assetManager);
        AssetRetrieval retrieval = new AssetRetrieval(assetManager);
        AssetSharing sharing = new AssetSharing(assetManager);

        // Example usage
        byte[] dummyData = "This is a test asset".getBytes();
        Asset asset = new Asset("1", "TestAsset.txt", "text/plain", dummyData);

        storage.storeAsset(asset);

        Asset retrieved = retrieval.retrieveAsset("1");
        if (retrieved != null) {
            System.out.println("Retrieved Asset: " + retrieved.getName());
        }

        sharing.shareAsset("1", "recipient@example.com");
    }
}