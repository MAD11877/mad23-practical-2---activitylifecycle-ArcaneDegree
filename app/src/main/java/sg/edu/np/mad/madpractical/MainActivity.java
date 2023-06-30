package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    User user = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        this.user.name = "MAD";

        this.user.description = getString(R.string.user_description_textview_placeholder_text);

        this.user.followed = false;

        this.user.id = 1;

        ((TextView) findViewById(R.id.UserNameTextView)).setText(this.user.name);

        ((TextView) findViewById(R.id.UserDescriptionTextView)).setText(this.user.description);

        ((Button) findViewById(R.id.FollowButton)).setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MainActivity.this.user.followed = !MainActivity.this.user.followed;

                    if (MainActivity.this.user.followed == true)
                    {
                        ((Button) v).setText(R.string.unfollow_button_text);
                    }
                    else
                    {
                        ((Button) v).setText(R.string.follow_button_text);
                    }
                }
            }
        );
    }
}