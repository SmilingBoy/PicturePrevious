package com.smile.pictureprevious;

import com.smile.zqpictureprevious.ImgesPreviousTools;

/**
 * @author Smile
 * @date 2017/11/30
 */

public class ImgeData implements ImgesPreviousTools.ImagePreviousData {

    private String imgUrl;

    public ImgeData(String imgUrl) {
        this.imgUrl = imgUrl;
    }


    @Override
    public String imgUrl() {
        return imgUrl;
    }
}
