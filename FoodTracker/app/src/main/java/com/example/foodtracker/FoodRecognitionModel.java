package com.example.foodtracker;
import com.google.mlkit.vision.common.InputImage;

import com.google.mlkit.vision.label.ImageLabel;

import com.google.mlkit.vision.label.ImageLabeler;

import com.google.mlkit.vision.label.ImageLabelerOptions;

public class FoodRecognitionModel {
    private ImageLabeler labeler;


    public FoodRecognitionModel() {

        ImageLabelerOptions options = new ImageLabelerOptions.Builder()

                .setConfidenceThreshold(0.5f)

                .build();

        labeler = ImageLabeler.getInstance(options);

    }


    public List<ImageLabel> recognizeFood(Bitmap bitmap) {

        InputImage image = InputImage.fromBitmap(bitmap, 0);

        List<ImageLabel> labels = labeler.process(image);

        return labels;

    }

}

