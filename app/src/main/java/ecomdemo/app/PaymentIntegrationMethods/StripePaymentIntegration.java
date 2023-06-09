/*
package co.sandyedemo.ecomdemo.PaymentIntegrationMethods;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import co.malufdemo.ecomdemo.Activities.ecomdemo.MainActivity;
import co.malufdemo.ecomdemo.Adapters.ecomdemo.CartListAdapter;
import co.malufdemo.ecomdemo.Fragments.ecomdemo.ChoosePaymentMethod;
import co.malufdemo.ecomdemo.Fragments.ecomdemo.MyCartList;
import co.malufdemo.ecomdemo.MVP.ecomdemo.StripeResponse;
import co.sandyedemo.ecomdemo.R;
import co.malufdemo.ecomdemo.Retrofit.ecomdemo.Api;
//import com.stripe.android.Stripe;
//import com.stripe.android.TokenCallback;
//import com.stripe.android.model.Card;
//import com.stripe.android.model.Token;
//import com.stripe.android.view.CardInputWidget;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.pedant.SweetAlert.SweetAlertDialog;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class StripePaymentIntegration extends AppCompatActivity {

    @BindView(R.id.submit)
    Button submit;
    SweetAlertDialog pDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stripe_payment_integration);
        ButterKnife.bind(this);
        final CardInputWidget mCardInputWidget = (CardInputWidget) findViewById(R.id.card_input_widget);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pDialog = new SweetAlertDialog(StripePaymentIntegration.this, SweetAlertDialog.PROGRESS_TYPE);
                pDialog.getProgressHelper().setBarColor(getResources().getColor(R.color.colorPrimary));
                pDialog.setTitleText("Loading");
                pDialog.setCancelable(false);
                pDialog.show();
                try {
                    Log.d("cardDetails", mCardInputWidget.getCard().getNumber());
                    Card cardToSave = mCardInputWidget.getCard();
                    if (cardToSave == null) {
                        Toast.makeText(getApplicationContext(), "Invalid Card Data", Toast.LENGTH_SHORT).show();
                    }
                    Stripe stripe = new Stripe(StripePaymentIntegration.this, "your_key");
                    stripe.createToken(
                            cardToSave,
                            new TokenCallback() {
                                public void onSuccess(Token token) {
                                    // Send token to your server
                                    Log.d("stripeToken", token.getId() + "");
                                    sendStripeToken(token);
                                }

                                public void onError(Exception error) {
                                    // Show localized error message
                                    Toast.makeText(getApplicationContext(),
                                            error.toString(),
                                            Toast.LENGTH_LONG
                                    ).show();
                                    pDialog.dismiss();
                                }
                            }
                    );
                } catch (Exception e) {
                    new SweetAlertDialog(StripePaymentIntegration.this)
                            .setTitleText("Card Details:")
                            .setContentText("Please fill your card details.")
                            .show();
                    pDialog.dismiss();

                }
            }
        });
    }

    */
/*private void sendStripeToken(Token token) {

        // sending gcm token to server
        Api.getClient().stripePayment(token.getId(),
                CartListAdapter.totalAmountPayable,
                MainActivity.userId,
                MyCartList.cartistResponseData.getCartid(),
                ChoosePaymentMethod.address,
                ChoosePaymentMethod.mobileNo,
                new Callback<StripeResponse>() {
                    @Override
                    public void success(StripeResponse stripeResponse, Response response) {
                        pDialog.dismiss();
                        try {
                            Log.d("stripeResponse", stripeResponse.getStatus());
                            if (stripeResponse.getStatus().equalsIgnoreCase("succeeded"))
                            {
                                Intent intent=new Intent(StripePaymentIntegration.this,OrderConfirmed.class);
                                startActivity(intent);
                            //    finishAffinity();
                            }else {
                                finish();
                            }

                        } catch (Exception e) {
                            new SweetAlertDialog(StripePaymentIntegration.this)
                                    .setTitleText("Payment Failed")
                                    .setContentText("Something went wrong. Please try Again.")
                                    .show();
                        }
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        pDialog.dismiss();

                        Log.e("error", error.toString());
                    }
                });
    }*//*

}
*/
