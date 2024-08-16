package asset;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DigitalAssetManagementSimpleTest {

    @Test
    public void testAssetCreation() {
        AssetManager assetManager = new AssetManager(); // AssetManager initialized here
        byte[] data = "Test Data".getBytes();
        Asset asset = new Asset("1", "TestAsset", "text/plain", data);

        assertEquals("1", asset.getId());
        assertEquals("TestAsset", asset.getName());
        assertEquals("text/plain", asset.getType());
        assertArrayEquals(data, asset.getData());
    }

    @Test
    public void testAddAndRetrieveAsset() {
        AssetManager assetManager = new AssetManager(); // AssetManager initialized here
        Asset asset = new Asset("2", "SampleAsset", "text/plain", "Sample Data".getBytes());
        assetManager.addAsset(asset);

        Asset retrieved = assetManager.getAsset("2");
        assertNotNull(retrieved);
        assertEquals("SampleAsset", retrieved.getName());
    }

    @Test
    public void testRemoveAsset() {
        AssetManager assetManager = new AssetManager(); // AssetManager initialized here
        Asset asset = new Asset("3", "AssetToRemove", "text/plain", "Data".getBytes());
        assetManager.addAsset(asset);
        assertNotNull(assetManager.getAsset("3"));

        assetManager.removeAsset("3");
        assertNull(assetManager.getAsset("3"));
    }

    @Test
    public void testListAssets() {
        AssetManager assetManager = new AssetManager(); // AssetManager initialized here
        assetManager.addAsset(new Asset("4", "Asset1", "text/plain", "Data1".getBytes()));
        assetManager.addAsset(new Asset("5", "Asset2", "text/plain", "Data2".getBytes()));

        assertEquals(2, assetManager.listAssets().size());
    }
}
