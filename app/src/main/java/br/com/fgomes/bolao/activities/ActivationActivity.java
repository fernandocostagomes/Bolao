package br.com.fgomes.bolao.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.app.LoaderManager.LoaderCallbacks;

import android.content.CursorLoader;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;

import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.fgomes.bolao.R;

import static android.Manifest.permission.READ_CONTACTS;

/**
 * A login screen that offers login via name and key.
 */
public class ActivationActivity extends AppCompatActivity {

    private TextView mTvName;
    private TextView mTvKey;
    private Button mBtActivate;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        mTvName = (TextView) findViewById(R.id.tv_name_activation);
        mTvKey = (TextView) findViewById(R.id.tv_key_activation);
        mBtActivate = (Button) findViewById(R.id.bt_activation);
    }

    public void evtActivation(View p_view)
    {
        String name = mTvName.getText().toString();
        String key = mTvKey.getText().toString();



    }
}

