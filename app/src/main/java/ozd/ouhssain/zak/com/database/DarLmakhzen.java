package ozd.ouhssain.zak.com.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class DarLmakhzen extends AppCompatActivity {

    Animation fade_in, fade_out;
    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dar_lmakhzen);

        viewFlipper = (ViewFlipper) this.findViewById(R.id.bckgrndViewFlipper1);

        fade_in = AnimationUtils.loadAnimation(this,android.R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this,android.R.anim.fade_out);

        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setOutAnimation(fade_out);

        //sets auto flipping
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();
    }
}
