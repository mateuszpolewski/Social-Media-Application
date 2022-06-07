package com.example.socialmediaapp.bucket;

import lombok.Getter;

@Getter
public enum BucketName {
    PROFILE_IMAGE("image-upload-1");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }
}
