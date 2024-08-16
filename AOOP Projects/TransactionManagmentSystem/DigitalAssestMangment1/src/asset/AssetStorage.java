package asset;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AssetStorage {
    private AssetManager assetManager;
    private static final String STORAGE_PATH = "assets/";

    public AssetStorage(AssetManager assetManager) {
        this.assetManager = assetManager;
        // Create the directory if it doesn't exist
        try {
            Files.createDirectories(Paths.get(STORAGE_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void storeAsset(Asset asset) {
        // Store the asset data in the file system
        try (FileOutputStream fos = new FileOutputStream(STORAGE_PATH + asset.getId())) {
            fos.write(asset.getData());
            assetManager.addAsset(asset);
            System.out.println("Asset stored successfully: " + asset.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}