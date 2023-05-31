package com.mgdapps.cardmagic;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Catagories extends AppCompatActivity {

    ListView lv_listview;


    CardReference cardReference;

    String cards_title[] = {"1.Knowing guessed card", "2.Bringing the Card to the Top", "3.Acing The Four Appearing Aces", "4.Making Card Prediction Easy",
            "5.Guessing the Bottom Card", "6.Pick a Card, Any Card", "7.Handling Handkerchief Prediction", "8.The Eights End Up Together",
            "9.Anty Gravity Card Trick", "10.Easy Card Change Magic Trick", "11.Easy Vanishing Card Trick", "12.Rising Playing Card Trick",
            "13.Card Snap Change Trick", "14.Card Trick Melting Card Illusion", "15.Impossible Card Deck Balance", "16.World's Simplest Trick",
            "17.Sleight:- The Glide", "18.World's Greatest Easy Card Magic Trick", "19.How to Float and Spin a Playing Card", "20.The Rising Card",
            "21.The Floating Card", "22.Hypercard Amazing Card Illusion"};

    int cards_listimages[] = {R.drawable.cards_zero, R.drawable.card_two_zero, R.drawable.card_three_one, R.drawable.card_four_two, R.drawable.card_five_one, R.drawable.card_six_two, R.drawable.card_seven_one, R.drawable.card_eight_one, R.drawable.card_nine_zero, R.drawable.card_ten_zero, R.drawable.card_eleven_zero,
            R.drawable.card_twelve_zero, R.drawable.card_thirteen_zero, R.drawable.card_fourteen_zero, R.drawable.card_fifteen_zero, R.drawable.card_sixteen_three,
            R.drawable.card_seventeen_zero, R.drawable.card_eighteen_one, R.drawable.card_nineteen_one, R.drawable.card_twenty_one, R.drawable.card_twentyone_one,
            R.drawable.card_twentytwo_one};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagories);



            lv_listview = (ListView) findViewById(R.id.lv_listview);


            ListAdapter listAdapter = new ListAdapter();

            lv_listview.setAdapter(listAdapter);

            lv_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    switch (position) {
                        case 0: {
                            Intent intent = new Intent(getApplicationContext(), CustomPager.class);
                            intent.putExtra("result", "cardone");
                            startActivity(intent);

                            break;
                        }
                        case 1: {
                            Intent intent = new Intent(getApplicationContext(), CustomPager.class);
                            intent.putExtra("result", "cardtwo");
                            startActivity(intent);
                            break;
                        }
                        case 2: {
                            Intent intent = new Intent(getApplicationContext(), CustomPager.class);
                            intent.putExtra("result", "cardthree");
                            startActivity(intent);

                            break;
                        }
                        case 3: {
                            Intent intent = new Intent(getApplicationContext(), CustomPager.class);
                            intent.putExtra("result", "cardfour");
                            startActivity(intent);

                            break;
                        }
                        case 4: {
                            Intent intent = new Intent(getApplicationContext(), CustomPager.class);
                            intent.putExtra("result", "cardfive");
                            startActivity(intent);

                            break;
                        }

                        case 5: {
                            Intent intent = new Intent(getApplicationContext(), CustomPager.class);
                            intent.putExtra("result", "cardsix");
                            startActivity(intent);

                            break;
                        }

                        case 6: {
                            Intent intent = new Intent(getApplicationContext(), CustomPager.class);
                            intent.putExtra("result", "cardseven");
                            startActivity(intent);

                            break;
                        }

                        case 7: {
                            Intent intent = new Intent(getApplicationContext(), CustomPager.class);
                            intent.putExtra("result", "cardeight");
                            startActivity(intent);

                            break;
                        }

                        case 8: {
                            Intent intent = new Intent(getApplicationContext(), Custom_videopager.class);
                            intent.putExtra("position", 0);
                            startActivity(intent);

                            break;
                        }
                        case 9: {
                            Intent intent = new Intent(getApplicationContext(), Custom_videopager.class);
                            intent.putExtra("position", 1);
                            startActivity(intent);

                            break;
                        }

                        case 10: {
                            Intent intent = new Intent(getApplicationContext(), Custom_videopager.class);
                            intent.putExtra("position", 2);
                            startActivity(intent);

                            break;
                        }
                        case 11: {
                            Intent intent = new Intent(getApplicationContext(), Custom_videopager.class);
                            intent.putExtra("position", 3);
                            startActivity(intent);

                            break;
                        }
                        case 12: {
                            Intent intent = new Intent(getApplicationContext(), Custom_videopager.class);
                            intent.putExtra("position", 4);
                            startActivity(intent);

                            break;
                        }
                        case 13: {
                            Intent intent = new Intent(getApplicationContext(), Custom_videopager.class);
                            intent.putExtra("position", 5);
                            startActivity(intent);

                            break;
                        }

                        case 14: {
                            Intent intent = new Intent(getApplicationContext(), Custom_videopager.class);
                            intent.putExtra("position", 6);
                            startActivity(intent);

                            break;
                        }

                        case 15: {
                            Intent intent = new Intent(getApplicationContext(), CustomPager.class);
                            intent.putExtra("result", "cardsixteen");
                            startActivity(intent);

                            break;
                        }

                        case 16: {
                            Intent intent = new Intent(getApplicationContext(), Custom_videopager.class);
                            intent.putExtra("position", 7);
                            startActivity(intent);

                            break;
                        }

                        case 17: {
                            Intent intent = new Intent(getApplicationContext(), CustomPager.class);
                            intent.putExtra("result", "cardeighteen");
                            startActivity(intent);

                            break;
                        }

                        case 18: {
                            Intent intent = new Intent(getApplicationContext(), CustomPager.class);
                            intent.putExtra("result", "cardnineteen");
                            startActivity(intent);

                            break;
                        }
                        case 19: {
                            Intent intent = new Intent(getApplicationContext(), CustomPager.class);
                            intent.putExtra("result", "cardtwenty");
                            startActivity(intent);

                            break;
                        }
                        case 20: {
                            Intent intent = new Intent(getApplicationContext(), CustomPager.class);
                            intent.putExtra("result", "cardtwentyone");
                            startActivity(intent);

                            break;
                        }
                        case 21: {
                            Intent intent = new Intent(getApplicationContext(), CustomPager.class);
                            intent.putExtra("result", "cardtwentytwo");
                            startActivity(intent);

                            break;
                        }

                        default: {

                        }

                    }
                }
            });


        }


        public class ListAdapter extends BaseAdapter {


            @Override
            public int getCount() {
                return cards_listimages.length;
            }

            @Nullable
            @Override
            public Object getItem(int position) {
                return cards_listimages[position];
            }

            @Override
            public long getItemId(int position) {
                return cards_listimages[position];
            }

            @NonNull
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = layoutInflater.inflate(R.layout.list_row, parent, false);
                ImageView imageView = (ImageView) convertView.findViewById(R.id.list_img);
                TextView textView = (TextView) convertView.findViewById(R.id.list_textview);

                cardReference = new CardReference();
                imageView.setImageResource(cards_listimages[position]);
                textView.setText(cards_title[position]);

                return convertView;

            }
        }


    }

