package asset;

import java.util.HashMap;
import java.util.Map;

public class AssetManager {
    private Map<String, Asset> assets = new HashMap<>();

    public void addAsset(Asset asset) {
        assets.put(asset.getId(), asset);
    }

    public Asset getAsset(String id) {
        return assets.get(id);
    }

    public void removeAsset(String id) {
        assets.remove(id);
    }

    public Map<String, Asset> listAssets() {
        return new HashMap<>(assets);
    }
}