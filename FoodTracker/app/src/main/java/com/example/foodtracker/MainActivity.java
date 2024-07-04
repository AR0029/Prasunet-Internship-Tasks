package com.example.foodtracker;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private FoodRecognitionModel foodRecognitionModel;
    private CalorieEstimationModel calorieEstimationModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);

        textView = findViewById(R.id.textView);


        foodRecognitionModel = new FoodRecognitionModel();

        calorieEstimationModel = new CalorieEstimationModel();

    }


    public void captureImage(View view) {

        // Capture image using camera or gallery

        // ...


        // Recognize food item and estimate calorie value

        Bitmap bitmap = // Get bitmap from captured image

                List<ImageLabel> labels = foodRecognitionModel.recognizeFood(bitmap);

        String foodItem = labels.get(0).getText();

        double calorieValue = calorieEstimationModel.estimateCalories(foodItem);


        // Display results

        textView.setText("Recognized food item: " + foodItem + "\nEstimated calorie value: " + calorieValue);

    }

}