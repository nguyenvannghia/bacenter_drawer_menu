package bscenter.cf.drawermenu;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAction = (Button) findViewById(R.id.btnAction);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.dlContent);
        final RelativeLayout rlRootMenu = (RelativeLayout) findViewById(R.id.rlRootMenu);
        final FrameLayout frMain = (FrameLayout) findViewById(R.id.frMain);

        //set overlay to transparent
//        assert drawerLayout != null;
//        drawerLayout.setScrimColor(Color.TRANSPARENT);
//        drawerLayout.setStatusBarBackground(Color.TRANSPARENT);

        //move content while open menu
//        final float[] mLastTranslate = {0.0f};
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawerLayout, null, 0, 0) {
//            @Override
//            public void onDrawerSlide(View drawerView, float slideOffset) {
//                assert rlRootMenu != null;
//                float moveFactor = rlRootMenu.getWidth() * slideOffset;
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//                    assert frMain != null;
//                    frMain.setTranslationX(moveFactor);
//                } else {
//                    TranslateAnimation anim = new TranslateAnimation(mLastTranslate[0],
//                            moveFactor, 0.0f, 0.0f);
//                    anim.setDuration(0);
//                    anim.setFillAfter(true);
//                    assert frMain != null;
//                    frMain.startAnimation(anim);
//                    mLastTranslate[0] = moveFactor;
//                }
//            }
//        };
//        drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();


        //set action for button open and close menu
        assert btnAction != null;
        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerOpen(Gravity.START)) {
                    drawerLayout.closeDrawer(Gravity.START);
                } else {
                    drawerLayout.openDrawer(Gravity.START);
                }
            }
        });


        // Thanks you!
    }
}
