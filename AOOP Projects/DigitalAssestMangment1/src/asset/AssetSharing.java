package asset;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AssetSharing {
    private AssetManager assetManager;
    private static final String SHARED_PATH = "shared/";

    public AssetSharing(AssetManager assetManager) {
        this.assetManager = assetManager;
        // Create the directory if it doesn't exist
        try {
            Files.createDirectories(Paths.get(SHARED_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void shareAsset(String id, String recipient) {
        // Logic to share the asset by copying it to a shared directory
        Asset asset = assetManager.getAsset(id);
        if (asset != null) {
            try {
                Files.copy(Paths.get("assets/" + id), Paths.get(SHARED_PATH + id));
                System.out.println("Asset " + asset.getName() + " shared with " + recipient);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Asset not found with ID: " + id);
        }
    }
}