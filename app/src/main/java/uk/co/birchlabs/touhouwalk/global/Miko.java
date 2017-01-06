package uk.co.birchlabs.touhouwalk.global;

/**
 * Created by birch on 06/01/2017.
 */

public class Miko {
    private final int resource;
    private final String assetName;
    private final String engName;
    private final String jpName;

    public Miko(
            int resource,
            String assetName,
            String engName,
            String jpName
    ) {
        this.resource = resource;
        this.assetName = assetName;
        this.engName = engName;
        this.jpName = jpName;
    }

    public int getResource() {
        return resource;
    }

    public String getAssetName() {
        return assetName;
    }

    public String getEngName() {
        return engName;
    }

    public String getJpName() {
        return jpName;
    }
}
