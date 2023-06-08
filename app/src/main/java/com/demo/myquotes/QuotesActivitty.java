package com.demo.myquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class QuotesActivitty extends AppCompatActivity {
    RecyclerView rcv;
    TextView txttitle;
    String title;
    ArrayList<QuotesModelclass> quotelist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);
        initview();
    }

    private void initview() {
        rcv = findViewById(R.id.rcv);
        txttitle = findViewById(R.id.txttitle);

        if (getIntent() != null)
        {
            title = getIntent().getStringExtra("Category");
            txttitle.setText(title);


             if (title.equals("Happy")) {
                QuotesModelclass m1 = new QuotesModelclass();
                m1.setQuotes(" “Happiness depends upon ourselves.”");
                quotelist.add(m1);
                QuotesModelclass m2 = new QuotesModelclass();
                m2.setQuotes("“Very little is needed to make a happy life; it is all within yourself, in your way of thinking.”");
                quotelist.add(m2);
                QuotesModelclass m3 = new QuotesModelclass();
                m3.setQuotes(" “Happiness is nothing more than good health and a bad memory.” ");
                quotelist.add(m3);
                QuotesModelclass m4 = new QuotesModelclass();
                m4.setQuotes("“The first recipe for happiness is: avoid too lengthy meditation on the past.” ");
                quotelist.add(m4);
                QuotesModelclass m5 = new QuotesModelclass();
                m5.setQuotes(" \"Success is getting what you want. Happiness is wanting what you get.\" ");
                quotelist.add(m5);
                QuotesModelclass m6 = new QuotesModelclass();
                m6.setQuotes("“Time you enjoy wasting is not wasted time.”");
                quotelist.add(m6);
                QuotesModelclass m7 = new QuotesModelclass();
                m7.setQuotes("“Love is that condition in which the happiness of another person is essential to your own.”");
                quotelist.add(m7);
                QuotesModelclass m8 = new QuotesModelclass();
                m8.setQuotes("“Take responsibility of your own happiness, never put it in other people’s hands.”");
                quotelist.add(m8);
                QuotesModelclass m9 = new QuotesModelclass();
                m9.setQuotes("Happiness is like a butterfly which, when pursued, is always beyond our grasp, but, if you will sit down quietly, may alight upon you.");
                quotelist.add(m9);
                QuotesModelclass m10 = new QuotesModelclass();
                m10.setQuotes("Happiness? That’s nothing more than good health and a poor memory.");
                quotelist.add(m10);
                QuotesModelclass m11 = new QuotesModelclass();
                m11.setQuotes("Be happy with what you want. Be excited about what you get");
                quotelist.add(m11);
                QuotesModelclass m12 = new QuotesModelclass();
                m12.setQuotes("The happiness of your life depends upon the quality of your thoughts.");
                quotelist.add(m12);
                QuotesModelclass m13 = new QuotesModelclass();
                m13.setQuotes("Happiness comes in waves. It’ll find you again.");
                quotelist.add(m13);
                QuotesModelclass m14 = new QuotesModelclass();
                m14.setQuotes("Sometimes your joy is the source of your smile, but sometimes your smile can be the source of your joy.");
                quotelist.add(m14);
                QuotesModelclass m15 = new QuotesModelclass();
                m15.setQuotes("Make Yourself a priority, Today do somethimg for yourself that will make you Smile");
                quotelist.add(m15);
            }

            else if (title.equals("Sad")) {
                QuotesModelclass m1 = new QuotesModelclass();
                m1.setQuotes("“It’s amazing how someone can break your heart and you can still love them with all the little pieces.” ");
                quotelist.add(m1);
                QuotesModelclass m2 = new QuotesModelclass();
                m2.setQuotes("“Never feel regret for your own decisions. If, you will not respect your own decisions, who else will?”");
                quotelist.add(m2);
                QuotesModelclass m3 = new QuotesModelclass();
                m3.setQuotes("“I always like walking in the rain, so no one can see me crying.” ");
                quotelist.add(m3);
                QuotesModelclass m4 = new QuotesModelclass();
                m4.setQuotes("“Sadness flies away on the wings of time.” ");
                quotelist.add(m4);
                QuotesModelclass m5 = new QuotesModelclass();
                m5.setQuotes(" “Be strong now because things will get better. It might be stormy now, but it can’t rain forever” ");
                quotelist.add(m5);
                QuotesModelclass m6 = new QuotesModelclass();
                m6.setQuotes("“Maybe we all have darkness inside of us and some of us are better at dealing with it than others.”");
                quotelist.add(m6);
                QuotesModelclass m7 = new QuotesModelclass();
                m7.setQuotes("“Don’t cry because it’s over, smile because it happened.”");
                quotelist.add(m7);
                QuotesModelclass m8 = new QuotesModelclass();
                m8.setQuotes("“Your silence hurt me more than your words.”");
                quotelist.add(m8);
                QuotesModelclass m9 = new QuotesModelclass();
                m9.setQuotes("“Tears come from the heart and not from the brain.”");
                quotelist.add(m9);
                QuotesModelclass m10 = new QuotesModelclass();
                m10.setQuotes("“Heavy hearts, like heavy clouds in the sky, are best relieved by the letting of a little water.”");
                quotelist.add(m10);
                QuotesModelclass m11 = new QuotesModelclass();
                m11.setQuotes("“When you’re happy, you enjoy the music but when you’re sad, you understand the lyrics.” ");
                quotelist.add(m11);
                QuotesModelclass m12 = new QuotesModelclass();
                m12.setQuotes("“People cry, not because they are weak. It is because they’ve been strong for too long.”");
                quotelist.add(m12);
                QuotesModelclass m13 = new QuotesModelclass();
                m13.setQuotes("“You cannot protect yourself from sadness without protecting yourself from happiness.”");
                quotelist.add(m13);
                QuotesModelclass m14 = new QuotesModelclass();
                m14.setQuotes("The sky cries for those filled with sadness.");
                quotelist.add(m14);
                QuotesModelclass m15 = new QuotesModelclass();
                m15.setQuotes("There are moments when I wish I could roll back the clock and take all the sadness away, but I have the feeling that if I did, the joy would be gone as well.");
                quotelist.add(m15);
            }

            else if (title.equals("Attitude")) {
                QuotesModelclass m1 = new QuotesModelclass();
                m1.setQuotes("Attitude is a little thing that makes a big difference.");
                quotelist.add(m1);
                QuotesModelclass m2 = new QuotesModelclass();
                m2.setQuotes("For success, attitude is equally as important as ability");
                quotelist.add(m2);
                QuotesModelclass m3 = new QuotesModelclass();
                m3.setQuotes("  Character is the result of two things: mental attitude and the way we spend our time.");
                quotelist.add(m3);
                QuotesModelclass m4 = new QuotesModelclass();
                m4.setQuotes("The attitude is very important. Because, your behavior radiates how you feel.");
                quotelist.add(m4);
                QuotesModelclass m5 = new QuotesModelclass();
                m5.setQuotes(" The ideal attitude is to be physically loose and mentally tight.");
                quotelist.add(m5);
                QuotesModelclass m6 = new QuotesModelclass();
                m6.setQuotes("Ability is what you're capable of doing. Motivation determines what you do. Attitude determines how well you do it.");
                quotelist.add(m6);
                QuotesModelclass m7 = new QuotesModelclass();
                m7.setQuotes("A positive attitude causes a chain reaction of positive thoughts, events and outcomes. It is a catalyst and it sparks extraordinary results.");
                quotelist.add(m7);
                QuotesModelclass m8 = new QuotesModelclass();
                m8.setQuotes("A positive attitude can really make dreams come true - it did for me.");
                quotelist.add(m8);
                QuotesModelclass m9 = new QuotesModelclass();
                m9.setQuotes("“Look on every exit as being an entrance somewhere else.”");
                quotelist.add(m9);
                QuotesModelclass m10 = new QuotesModelclass();
                m10.setQuotes("“When you take control of your attitude, you take control of your life.”\n");
                quotelist.add(m10);
                QuotesModelclass m11 = new QuotesModelclass();
                m11.setQuotes("Be an independent thinker at all times, and ignore anyone who attempts to define you in a limiting way.");
                quotelist.add(m11);
                QuotesModelclass m12 = new QuotesModelclass();
                m12.setQuotes("Treat me well and I’ll double the favor.");
                quotelist.add(m12);
                QuotesModelclass m13 = new QuotesModelclass();
                m13.setQuotes("Good is not good enough. I deserve more and that’s greatness.\n");
                quotelist.add(m13);
                QuotesModelclass m14 = new QuotesModelclass();
                m14.setQuotes("I don’t compare myself with others. I know I am the best in my own way.\n");
                quotelist.add(m14);
                QuotesModelclass m15 = new QuotesModelclass();
                m15.setQuotes("My attitude is a virus that’s well worth catching.\n");
                quotelist.add(m15);
            }

             else  if (title.equals("Angry")) {
                QuotesModelclass m1 = new QuotesModelclass();
                m1.setQuotes(" “Bitterness is like cancer. It eats upon the host. But anger is like fire. It burns it all clean.”");
                quotelist.add(m1);
                QuotesModelclass m2 = new QuotesModelclass();
                m2.setQuotes("“I want to commit the murder I was imprisoned for.”");
                quotelist.add(m2);
                QuotesModelclass m3 = new QuotesModelclass();
                m3.setQuotes(" “Speak when you are angry and you will make the best speech you will ever regret.” ");
                quotelist.add(m3);
                QuotesModelclass m4 = new QuotesModelclass();
                m4.setQuotes(" “Anger is an acid that can do more harm to the vessel in which it is stored than to anything on which it is poured.”\n");
                quotelist.add(m4);
                QuotesModelclass m5 = new QuotesModelclass();
                m5.setQuotes(" “Most misunderstandings in the world could be avoided if people would simply take the time to ask, \"What else could this mean?” ");
                quotelist.add(m5);
                QuotesModelclass m6 = new QuotesModelclass();
                m6.setQuotes("“It is wise to direct your anger towards problems -- not people; to focus your energies on answers -- not excuses.”\n");
                quotelist.add(m6);
                QuotesModelclass m7 = new QuotesModelclass();
                m7.setQuotes("“Usually when people are sad, they don't do anything. They just cry over their condition. But when they get angry, they bring about a change.”");
                quotelist.add(m7);
                QuotesModelclass m8 = new QuotesModelclass();
                m8.setQuotes("“Never respond to an angry person with a fiery comeback, even if he deserves it...Don't allow his anger to become your anger.”");
                quotelist.add(m8);
                QuotesModelclass m9 = new QuotesModelclass();
                m9.setQuotes("“A heart filled with anger has no room for love.");
                quotelist.add(m9);
                QuotesModelclass m10 = new QuotesModelclass();
                m10.setQuotes(" “Anger is like a storm rising up from the bottom of your consciousness. When you feel it coming, turn your focus to your breath.” ");
                quotelist.add(m10);
                QuotesModelclass m11 = new QuotesModelclass();
                m11.setQuotes("“Anger is the feeling that makes your mouth work faster than your mind.”");
                quotelist.add(m11);
                QuotesModelclass m12 = new QuotesModelclass();
                m12.setQuotes("Angry people are not always wise.");
                quotelist.add(m12);
                QuotesModelclass m13 = new QuotesModelclass();
                m13.setQuotes("“For every minute you remain angry, you give up sixty seconds of peace of mind.”");
                quotelist.add(m13);
                QuotesModelclass m14 = new QuotesModelclass();
                m14.setQuotes("“Do not be quickly provoked in your spirit, for anger resides in the lap of fools.”");
                quotelist.add(m14);
                QuotesModelclass m15 = new QuotesModelclass();
                m15.setQuotes(" “You will not be punished for your anger, you will be punished by your anger.”");
                quotelist.add(m15);
            }

             else if (title.equals("Friendship")) {
                 QuotesModelclass  m1 = new QuotesModelclass();
                 m1.setQuotes("Friendship is the hardest thing in the world to explain. It’s not something you learn in school. But if you haven’t learned the meaning of friendship, you really haven’t learned anything.” ");
                 quotelist.add(m1);

                 QuotesModelclass  m2 = new QuotesModelclass();
                 m2.setQuotes("Don’t make friends who are comfortable to be with. Make friends who will force you to lever yourself up.");
                 quotelist.add(m2);

                 QuotesModelclass  m3 = new QuotesModelclass();
                 m3.setQuotes("The most beautiful discovery true friends make is that they can grow separately without growing apart.");
                 quotelist.add(m3);


                 QuotesModelclass  m4 = new QuotesModelclass();
                 m4.setQuotes("Each friend represents a world in us, a world possibly not born until they arrive, and it is only by this meeting that a new world is born.");
                 quotelist.add(m4);


                 QuotesModelclass  m5 = new QuotesModelclass();
                 m5.setQuotes("Find a group of people who challenge and inspire you; spend a lot of time with them, and it will change your life.");
                 quotelist.add(m5);


                 QuotesModelclass  m6 = new QuotesModelclass();
                 m6.setQuotes("They may forget what you said, but they will never forget how you made them feel.");
                 quotelist.add(m6);


                 QuotesModelclass  m7 = new QuotesModelclass();
                 m7.setQuotes("For beautiful eyes, look for the good in others; for beautiful lips, speak only words of kindness; and for poise, walk with the knowledge that you are never alone.");
                 quotelist.add(m7);


                 QuotesModelclass  m8 = new QuotesModelclass();
                 m8.setQuotes("Happiness can be found even in the darkest of times, if one only remembers to turn on the light.");
                 quotelist.add(m8);


                 QuotesModelclass  m9 = new QuotesModelclass();
                 m9.setQuotes("A real friend is one who walks in when the rest of the world walks out.");
                 quotelist.add(m9);


                 QuotesModelclass  m10 = new QuotesModelclass();
                 m10.setQuotes("A friend is someone who understands your past, believes in your future, and accepts you just the way you are.");
                 quotelist.add(m10);


                 QuotesModelclass  m11 = new QuotesModelclass();
                 m11.setQuotes("Growing apart doesn’t change the fact that for a long time we grew side by side; our roots will always be tangled. I’m glad for that.");
                 quotelist.add(m11);


                 QuotesModelclass  m12 = new QuotesModelclass();
                 m12.setQuotes("Let us be grateful to the people who make us happy; they are the charming gardeners who make our souls blossom.");
                 quotelist.add(m12);


                 QuotesModelclass  m13 = new QuotesModelclass();
                 m13.setQuotes("Lots of people want to ride with you in the limo, but what you want is someone who will take the bus with you when the limo breaks down.");
                 quotelist.add(m13);


                 QuotesModelclass  m14 = new QuotesModelclass();
                 m14.setQuotes("In the sweetness of friendship let there be laughter, for in the dew of little things the heart finds its morning and is refreshed.");
                 quotelist.add(m14);


                 QuotesModelclass  m15 = new QuotesModelclass();
                 m15.setQuotes("It’s not what we have in life, but who we have in our life that matters.");
                 quotelist.add(m15);
            }

            else if (title.equals("Love")) {
                 QuotesModelclass  m1 = new QuotesModelclass();
                 m1.setQuotes("As he read, I fell in love the way you fall asleep: slowly, and then all at once.");
                 quotelist.add(m1);

                 QuotesModelclass  m2 = new QuotesModelclass();
                 m2.setQuotes("Loved you yesterday, love you still, always have, always will.");
                 quotelist.add(m2);

                 QuotesModelclass  m3 = new QuotesModelclass();
                 m3.setQuotes("I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more.");
                 quotelist.add(m3);


                 QuotesModelclass  m4 = new QuotesModelclass();
                 m4.setQuotes("I love you not only for what you are, but for what I am when I am with you. I love you not only for what you have made of yourself, but for what you are making of me. I love you for the part of me that you bring out.");
                 quotelist.add(m4);


                 QuotesModelclass  m5 = new QuotesModelclass();
                 m5.setQuotes("The real lover is a man who can thrill you by kissing your forehead or smiling into your eyes or just staring into space.");
                 quotelist.add(m5);


                 QuotesModelclass  m6 = new QuotesModelclass();
                 m6.setQuotes("In all the world, there is no heart for me like yours. In all the world, there is no love for you like mine.");
                 quotelist.add(m6);


                 QuotesModelclass  m7 = new QuotesModelclass();
                 m7.setQuotes("I’ll be loving you, always with a love that’s true");
                 quotelist.add(m7);


                 QuotesModelclass  m8 = new QuotesModelclass();
                 m8.setQuotes("Thinking of you keeps me awake. Dreaming of you keeps me asleep. Being with you keeps me alive.");
                 quotelist.add(m8);


                 QuotesModelclass  m9 = new QuotesModelclass();
                 m9.setQuotes("I need you like a heart needs a beat.");
                 quotelist.add(m9);


                 QuotesModelclass  m10 = new QuotesModelclass();
                 m10.setQuotes("If I know what love is, it is because of you.");
                 quotelist.add(m10);


                 QuotesModelclass  m11 = new QuotesModelclass();
                 m11.setQuotes("I swear I couldn’t love you more than I do right now, and yet I know I will tomorrow.");
                 quotelist.add(m11);


                 QuotesModelclass  m12 = new QuotesModelclass();
                 m12.setQuotes("If you live to be a hundred, I want to live to be a hundred minus one day so I never have to live without you.");
                 quotelist.add(m12);


                 QuotesModelclass  m13 = new QuotesModelclass();
                 m13.setQuotes("A man is already halfway in love with any woman who listens to him.");
                 quotelist.add(m13);


                 QuotesModelclass  m14 = new QuotesModelclass();
                 m14.setQuotes("I love you as certain dark things are to be loved, in secret, between the shadow and the soul.");
                 quotelist.add(m14);


                 QuotesModelclass  m15 = new QuotesModelclass();
                 m15.setQuotes("You make me want to be a better man.");
                 quotelist.add(m15);
            }

             else if (title.equals("Motivational")) {
                 QuotesModelclass m1 = new QuotesModelclass();
                 m1.setQuotes(" “All our dreams can come true, if we have the courage to pursue them.” ");
                 quotelist.add(m1);
                 QuotesModelclass m2 = new QuotesModelclass();
                 m2.setQuotes("“The secret of getting ahead is getting started.” ");
                 quotelist.add(m2);
                 QuotesModelclass m3 = new QuotesModelclass();
                 m3.setQuotes("“Don’t limit yourself. Many people limit themselves to what they think they can do. You can go as far as your mind lets you. What you believe, remember, you can achieve.” ");
                 quotelist.add(m3);
                 QuotesModelclass m4 = new QuotesModelclass();
                 m4.setQuotes(" “If people are doubting how far you can go, go so far that you can’t hear them anymore.”");
                 quotelist.add(m4);
                 QuotesModelclass m5 = new QuotesModelclass();
                 m5.setQuotes(" “Everything you can imagine is real.”");
                 quotelist.add(m5);
                 QuotesModelclass m6 = new QuotesModelclass();
                 m6.setQuotes("“It’s no use going back to yesterday, because I was a different person then.” ");
                 quotelist.add(m6);
                 QuotesModelclass m7 = new QuotesModelclass();
                 m7.setQuotes("“One day or day one. You decide.”");
                 quotelist.add(m7);
                 QuotesModelclass m8 = new QuotesModelclass();
                 m8.setQuotes("“No one is to blame for your future situation but yourself. If you want to be successful, then become ‘Successful.’”");
                 quotelist.add(m8);
                 QuotesModelclass m9 = new QuotesModelclass();
                 m9.setQuotes("“Invest in your dreams. Grind now. Shine later.” ");
                 quotelist.add(m9);
                 QuotesModelclass m10 = new QuotesModelclass();
                 m10.setQuotes("“Greatness only comes before hustle in the dictionary.”");
                 quotelist.add(m10);
                 QuotesModelclass m11 = new QuotesModelclass();
                 m11.setQuotes("“Invest in your dreams. Grind now. Shine later.”");
                 quotelist.add(m11);
                 QuotesModelclass m12 = new QuotesModelclass();
                 m12.setQuotes("“Hustle in silence and let your success make the noise.”");
                 quotelist.add(m12);
                 QuotesModelclass m13 = new QuotesModelclass();
                 m13.setQuotes("“Some people want it to happen, some wish it would happen, others make it happen.”");
                 quotelist.add(m13);
                 QuotesModelclass m14 = new QuotesModelclass();
                 m14.setQuotes("“Great things are done by a series of small things brought together.” ");
                 quotelist.add(m14);
                 QuotesModelclass m15 = new QuotesModelclass();
                 m15.setQuotes("“It’s not the load that breaks you down, it’s the way you carry it.”");
                 quotelist.add(m15);
            }

            else if (title.equals("Alone")) {
                 QuotesModelclass m1 = new QuotesModelclass();
                 m1.setQuotes(" “Loneliness is not a reality, it’s just a feeling. Convert it to SOLITUDE.” ");
                 quotelist.add(m1);
                 QuotesModelclass m2 = new QuotesModelclass();
                 m2.setQuotes("“Alone is state of being or body, whereas loneliness is state of mind.”");
                 quotelist.add(m2);
                 QuotesModelclass m3 = new QuotesModelclass();
                 m3.setQuotes(" “You’re only lonely if you’re not there for you.” ");
                 quotelist.add(m3);
                 QuotesModelclass m4 = new QuotesModelclass();
                 m4.setQuotes("“If you never share your feelings with anyone, you are bound to feel lonely.”");
                 quotelist.add(m4);
                 QuotesModelclass m5 = new QuotesModelclass();
                 m5.setQuotes(" “You never walk alone. Even the devil is the lord of flies.” ");
                 quotelist.add(m5);
                 QuotesModelclass m6 = new QuotesModelclass();
                 m6.setQuotes("“Music was my refuge. I could crawl into the space between the notes and curl my back to loneliness.” ");
                 quotelist.add(m6);
                 QuotesModelclass m7 = new QuotesModelclass();
                 m7.setQuotes("“Loneliness is and always has been the central and inevitable experience of every man.” ");
                 quotelist.add(m7);
                 QuotesModelclass m8 = new QuotesModelclass();
                 m8.setQuotes("“Inside myself is a place where I live all alone, and that’s where you renew your springs that never dry up.” ");
                 quotelist.add(m8);
                 QuotesModelclass m9 = new QuotesModelclass();
                 m9.setQuotes("“Sometimes you have to stand alone just to make sure you still can.”");
                 quotelist.add(m9);
                 QuotesModelclass m10 = new QuotesModelclass();
                 m10.setQuotes("“There’s nothing abnormal about loneliness.”");
                 quotelist.add(m10);
                 QuotesModelclass m11 = new QuotesModelclass();
                 m11.setQuotes("“It’s easy to stand with the crowd it takes courage to stand alone”\n");
                 quotelist.add(m11);
                 QuotesModelclass m12 = new QuotesModelclass();
                 m12.setQuotes("“Sometimes, you need to be alone. Not to be lonely, but to enjoy your free time being yourself.”");
                 quotelist.add(m12);
                 QuotesModelclass m13 = new QuotesModelclass();
                 m13.setQuotes("“Once you start loving your own presence, you stop chasing people in your life.” \n");
                 quotelist.add(m13);
                 QuotesModelclass m14 = new QuotesModelclass();
                 m14.setQuotes("“Sometimes you just need to be alone and let your tears out.”\n");
                 quotelist.add(m14);
                 QuotesModelclass m15 = new QuotesModelclass();
                 m15.setQuotes("“As I get older I’m more and more comfortable being alone.”");
                 quotelist.add(m15);
            }

             else if (title.equals("Beard")) {
                QuotesModelclass m1 = new QuotesModelclass();
                m1.setQuotes(" “Beards make a guy hotter.”");
                quotelist.add(m1);
                QuotesModelclass m2 = new QuotesModelclass();
                m2.setQuotes("“Don’t be jealous, it’s my beard!.”");
                quotelist.add(m2);
                QuotesModelclass m3 = new QuotesModelclass();
                m3.setQuotes(" “With a great beard comes great responsibility!.” ");
                quotelist.add(m3);
                QuotesModelclass m4 = new QuotesModelclass();
                m4.setQuotes("“A man without a beard is like a lion without a mane.” ");
                quotelist.add(m4);
                QuotesModelclass m5 = new QuotesModelclass();
                m5.setQuotes(" \"A beard is a gift you give your face.\" ");
                quotelist.add(m5);
                QuotesModelclass m6 = new QuotesModelclass();
                m6.setQuotes("A man who has a beard looks beardsome’!");
                quotelist.add(m6);
                QuotesModelclass m7 = new QuotesModelclass();
                m7.setQuotes("“You don’t know the power of the beard.”");
                quotelist.add(m7);
                QuotesModelclass m8 = new QuotesModelclass();
                m8.setQuotes("“Guys wear a suit to look important, I grew a beard.”");
                quotelist.add(m8);
                QuotesModelclass m9 = new QuotesModelclass();
                m9.setQuotes("“The man without a beard is like a lion without hair.!!.");
                quotelist.add(m9);
                QuotesModelclass m10 = new QuotesModelclass();
                m10.setQuotes("“Guys wear a suit to look important, I grew a beard.”");
                quotelist.add(m10);
                QuotesModelclass m11 = new QuotesModelclass();
                m11.setQuotes("“ Beard under construction.”");
                quotelist.add(m11);
                QuotesModelclass m12 = new QuotesModelclass();
                m12.setQuotes("“ It’s not a beard, I’ve trained to sit very still.”");
                quotelist.add(m12);
                QuotesModelclass m13 = new QuotesModelclass();
                m13.setQuotes("“Beard guy, excuse me miss’my eyes are up here.”");
                quotelist.add(m13);
                QuotesModelclass m14 = new QuotesModelclass();
                m14.setQuotes("“The world is full of boys, be a man of beard.”");
                quotelist.add(m14);
                QuotesModelclass m15 = new QuotesModelclass();
                m15.setQuotes("“. I don’t work out much but my beard lifts skirts.”");
                quotelist.add(m15);
            }

             else  if (title.equals("Confidence")) {
                QuotesModelclass m1 = new QuotesModelclass();
                m1.setQuotes(" “Happiness depends upon ourselves.”");
                quotelist.add(m1);
                QuotesModelclass m2 = new QuotesModelclass();
                m2.setQuotes("“Very little is needed to make a happy life; it is all within yourself, in your way of thinking.”");
                quotelist.add(m2);
                QuotesModelclass m3 = new QuotesModelclass();
                m3.setQuotes(" “Happiness is nothing more than good health and a bad memory.” ");
                quotelist.add(m3);
                QuotesModelclass m4 = new QuotesModelclass();
                m4.setQuotes("“The first recipe for happiness is: avoid too lengthy meditation on the past.” ");
                quotelist.add(m4);
                QuotesModelclass m5 = new QuotesModelclass();
                m5.setQuotes(" \"Success is getting what you want. Happiness is wanting what you get.\" ");
                quotelist.add(m5);
                 QuotesModelclass m6 = new QuotesModelclass();
                 m6.setQuotes("Sooner or later, those who win are those who think they can.");
                 quotelist.add(m6);
                 QuotesModelclass m7 = new QuotesModelclass();
                 m7.setQuotes("Remember that wherever your heart is, there you will find your treasure.");
                 quotelist.add(m7);
                 QuotesModelclass m8 = new QuotesModelclass();
                 m8.setQuotes("Accept who you are; and revel in it.");
                 quotelist.add(m8);
                 QuotesModelclass m9 = new QuotesModelclass();
                 m9.setQuotes("Success is most often achieved by those who don't know that failure is inevitable.");
                 quotelist.add(m9);
                 QuotesModelclass m10 = new QuotesModelclass();
                 m10.setQuotes("We don't see things as they are, we see them as we are.");
                 quotelist.add(m10);
                 QuotesModelclass m11 = new QuotesModelclass();
                 m11.setQuotes("You've got to take the initiative and play your game. In a decisive set, confidence is the difference.");
                 quotelist.add(m11);
                 QuotesModelclass m12 = new QuotesModelclass();
                 m12.setQuotes("Don't be satisfied with stories, how things have gone with others. Unfold your own myth.");
                 quotelist.add(m12);
                 QuotesModelclass m13 = new QuotesModelclass();
                 m13.setQuotes("A successful man is one who can lay a firm foundation with the bricks others have thrown at him.");
                 quotelist.add(m13);
                 QuotesModelclass m14 = new QuotesModelclass();
                 m14.setQuotes("Don't waste your energy trying to change opinions ... Do your thing, and don't care if they like it.");
                 quotelist.add(m14);
                 QuotesModelclass m15 = new QuotesModelclass();
                 m15.setQuotes("It took me a long time not to judge myself through someone else's eyes.");
                 quotelist.add(m15);
            }

             else if (title.equals("Funny")) {
                 QuotesModelclass m1 = new QuotesModelclass();
                 m1.setQuotes(" “Happiness depends upon ourselves.”");
                 quotelist.add(m1);
                 QuotesModelclass m2 = new QuotesModelclass();
                 m2.setQuotes("“Very little is needed to make a happy life; it is all within yourself, in your way of thinking.”");
                 quotelist.add(m2);
                 QuotesModelclass m3 = new QuotesModelclass();
                 m3.setQuotes(" “Happiness is nothing more than good health and a bad memory.” ");
                 quotelist.add(m3);
                 QuotesModelclass m4 = new QuotesModelclass();
                 m4.setQuotes("“The first recipe for happiness is: avoid too lengthy meditation on the past.” ");
                 quotelist.add(m4);
                 QuotesModelclass m5 = new QuotesModelclass();
                 m5.setQuotes(" \"Success is getting what you want. Happiness is wanting what you get.\" ");
                 quotelist.add(m5);
                 QuotesModelclass m6 = new QuotesModelclass();
                 m6.setQuotes("“I never feel more alone than when I’m trying to put sunscreen on my back.”");
                 quotelist.add(m6);
                 QuotesModelclass m7 = new QuotesModelclass();
                 m7.setQuotes("“I never forget a face—but in your case, I’ll be glad to make an exception.”");
                 quotelist.add(m7);
                 QuotesModelclass m8 = new QuotesModelclass();
                 m8.setQuotes("“If you want to be sure that you never forget your wife’s birthday, just try forgetting it once.” ");
                 quotelist.add(m8);
                 QuotesModelclass m9 = new QuotesModelclass();
                 m9.setQuotes("“Behind every great man is a woman rolling her eyes.” ");
                 quotelist.add(m9);
                 QuotesModelclass m10 = new QuotesModelclass();
                 m10.setQuotes(" “A perfect parent is a person with excellent child-rearing theories and no actual children.”");
                 quotelist.add(m10);
                 QuotesModelclass m11 = new QuotesModelclass();
                 m11.setQuotes("“When I was a kid my parents moved a lot, but I always found them.” ");
                 quotelist.add(m11);
                 QuotesModelclass m12 = new QuotesModelclass();
                 m12.setQuotes(" “There is no such thing as fun for the whole family.”");
                 quotelist.add(m12);
                 QuotesModelclass m13 = new QuotesModelclass();
                 m13.setQuotes("“Happiness is having a large, caring, close-knit family in another city.” ");
                 quotelist.add(m13);
                 QuotesModelclass m14 = new QuotesModelclass();
                 m14.setQuotes("“Thousands of years ago, cats were worshipped as gods. Cats have never forgotten this.” ");
                 quotelist.add(m14);
                 QuotesModelclass m15 = new QuotesModelclass();
                 m15.setQuotes("“Friends are God’s way of apologizing to us for our families.”");
                 quotelist.add(m15);
             }
                LinearLayoutManager manager = new LinearLayoutManager(QuotesActivitty.this, LinearLayoutManager.VERTICAL, true);
                rcv.setLayoutManager(manager);
                QuotesAdapter adapter = new QuotesAdapter(QuotesActivitty.this, quotelist);
                rcv.setAdapter(adapter);


        }


    }
}