package com.mgdapps.cardmagic;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class CustomPager extends AppCompatActivity {


    ViewPager viewPager;

    String result = null;


    CardReference cardReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_pager);

        result = getIntent().getExtras().getString("result");
        cardReference = new CardReference();
        viewPager = (ViewPager) findViewById(R.id.vp_viewpager);

        if (result.equals("cardone")) {
            PagerAdapter pagerAdapter = new PagerAdapter(getApplicationContext());
            pagerAdapter.gotcha(cardReference.cards_oneimage, cardReference.cards_onestring);
            viewPager.setAdapter(pagerAdapter);
            adds();
        }

        if (result.equals("cardtwo")) {

            PagerAdapter pagerAdapter = new PagerAdapter(getApplicationContext());
            pagerAdapter.gotcha(cardReference.cards_twoimage, cardReference.cards_twostring);
            viewPager.setAdapter(pagerAdapter);
            adds();
        }

        if (result.equals("cardthree")) {

            PagerAdapter pagerAdapter = new PagerAdapter(getApplicationContext());
            pagerAdapter.gotcha(cardReference.cards_threeimages, cardReference.cards_threestring);
            viewPager.setAdapter(pagerAdapter);
            adds();

        }
        if (result.equals("cardfour")) {

            PagerAdapter pagerAdapter = new PagerAdapter(getApplicationContext());
            pagerAdapter.gotcha(cardReference.cards_fourimage, cardReference.cards_fourstring);
            viewPager.setAdapter(pagerAdapter);
            adds();

        }
        if (result.equals("cardfive")) {

            PagerAdapter pagerAdapter = new PagerAdapter(getApplicationContext());
            pagerAdapter.gotcha(cardReference.cards_fiveimages, cardReference.cards_fivestring);
            viewPager.setAdapter(pagerAdapter);
            adds();

        }

        if (result.equals("cardsix")) {

            PagerAdapter pagerAdapter = new PagerAdapter(getApplicationContext());
            pagerAdapter.gotcha(cardReference.cards_siximage, cardReference.cards_sixstring);
            viewPager.setAdapter(pagerAdapter);
            adds();

        }


        if (result.equals("cardseven")) {

            PagerAdapter pagerAdapter = new PagerAdapter(getApplicationContext());
            pagerAdapter.gotcha(cardReference.cards_sevenimage, cardReference.cards_sevenstring);
            viewPager.setAdapter(pagerAdapter);
            adds();

        }


        if (result.equals("cardeight")) {

            PagerAdapter pagerAdapter = new PagerAdapter(getApplicationContext());
            pagerAdapter.gotcha(cardReference.cards_eightimage, cardReference.cards_eightstring);
            viewPager.setAdapter(pagerAdapter);
            adds();

        }


        if (result.equals("cardsixteen")) {

            PagerAdapter pagerAdapter = new PagerAdapter(getApplicationContext());
            pagerAdapter.gotcha(cardReference.cards_sixteenimage, cardReference.cards_sixteenstring);
            viewPager.setAdapter(pagerAdapter);
            adds();

        }

        if (result.equals("cardeighteen")) {

            PagerAdapter pagerAdapter = new PagerAdapter(getApplicationContext());
            pagerAdapter.gotcha(cardReference.cards_eighteenimage, cardReference.cards_eighteenstring);
            viewPager.setAdapter(pagerAdapter);
            adds();

        }

        if (result.equals("cardnineteen")) {

            PagerAdapter pagerAdapter = new PagerAdapter(getApplicationContext());
            pagerAdapter.gotcha(cardReference.cards_nineteenimage, cardReference.cards_nineteenstring);
            viewPager.setAdapter(pagerAdapter);
            adds();

        }


        if (result.equals("cardtwenty")) {

            PagerAdapter pagerAdapter = new PagerAdapter(getApplicationContext());
            pagerAdapter.gotcha(cardReference.cards_twentyimage, cardReference.cards_twentystring);
            viewPager.setAdapter(pagerAdapter);
            adds();

        }

        if (result.equals("cardtwentyone")) {

            PagerAdapter pagerAdapter = new PagerAdapter(getApplicationContext());
            pagerAdapter.gotcha(cardReference.cards_twentyoneimage, cardReference.cards_twentyonestring);
            viewPager.setAdapter(pagerAdapter);
            adds();

        }


        if (result.equals("cardtwentytwo")) {

            PagerAdapter pagerAdapter = new PagerAdapter(getApplicationContext());
            pagerAdapter.gotcha(cardReference.cards_twentytwoimage, cardReference.cards_twentytwostring);
            viewPager.setAdapter(pagerAdapter);
            adds();

        }


    }

    private void adds() {
        final InterstitialAd interstitialAd = new InterstitialAd(getApplicationContext());

        interstitialAd.setAdUnitId(getString(R.string.interstital_add));


        AdRequest adRequest = new AdRequest.Builder().build();


        interstitialAd.loadAd(adRequest);

        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                if (interstitialAd.isLoaded()) {
                    interstitialAd.show();
                }
            }
        });

    }

    public class PagerAdapter extends android.support.v4.view.PagerAdapter {


        int[] img;
        String[] description;

        LayoutInflater layoutInflater;
        Context context;

        public PagerAdapter(Context context) {
            this.context = context;

        }

        public void gotcha(int[] img, String[] text) {
            this.img = img;
            this.description = text;
        }

        @Override
        public int getCount() {
            return description.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return (view == (RelativeLayout) object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {

            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View view = layoutInflater.inflate(R.layout.pager_row, container, false);

            ImageView images = (ImageView) view.findViewById(R.id.vp_image);
            TextView tv_steps = (TextView) view.findViewById(R.id.tv_steps);
            TextView tv_description = (TextView) view.findViewById(R.id.tv_description);

            cardReference = new CardReference();


            images.setImageResource(img[position]);
            tv_description.setText(description[position]);
            tv_steps.setText("Step: " + (position + 1));

            container.addView(view);

            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((RelativeLayout) object);
        }
    }


//TODO:ca-app-pub-6192240920670894/6197070563

    //TODO: Banner : ca-app-pub-6192240920670894/2685200968

}
