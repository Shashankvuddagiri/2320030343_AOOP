package asset;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AssetRetrieval {
    private AssetManager assetManager;
    private static final String STORAGE_PATH = "assets/";

    public AssetRetrieval(AssetManager assetManager) {
        this.assetManager = assetManager;
    }

    public Asset retrieveAsset(String id) {
        // Retrieve the asset from the file system
        Asset asset = assetManager.getAsset(id);
        if (asset != null) {
            try {
                byte[] data = Files.readAllBytes(Paths.get(STORAGE_PATH + id));
                asset.setData(data);
                System.out.println("Asset retrieved successfully: " + asset.getName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Asset not found with ID: " + id);
        }
        return asset;
    }
}