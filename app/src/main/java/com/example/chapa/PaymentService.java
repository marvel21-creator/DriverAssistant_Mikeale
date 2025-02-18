package com.example.chapa;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PaymentService {
    @GET("miki/index.php") // Ensure this path is correct for your API
    Call<PaymentResponse> initializePayment(
            @Query("amount") int amount,
            @Query("phoneNumber") String phoneNumber,
            @Query("paymentMethod") String paymentMethod
    );
}