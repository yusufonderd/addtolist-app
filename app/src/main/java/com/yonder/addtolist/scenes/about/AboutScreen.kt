package com.yonder.addtolist.scenes.about

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.yonder.addtolist.BuildConfig
import com.yonder.addtolist.R
import com.yonder.addtolist.common.ui.extensions.getActivity
import com.yonder.addtolist.theme.padding_8

const val PRIVACY_POLICY_URL =
    "https://gist.github.com/yusufonderd/6214999f3540e0645c07730171dec16b"


@Composable
fun AboutScreen() {

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(padding_8)
    ) {
        Text(
            text = stringResource(R.string.about_description),
            style = MaterialTheme.typography.body1,
            color = colorResource(id = R.color.primaryTextColor)
        )
        Divider()

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = padding_8)
        ) {
            Text(
                text = stringResource(R.string.version),
                style = MaterialTheme.typography.body1,
                color = colorResource(id = R.color.primaryTextColor)
            )
            Text(
                text = BuildConfig.VERSION_NAME,
                style = MaterialTheme.typography.body1,
                color = colorResource(id = R.color.primaryTextColor)
            )
        }

        Divider()

        TextButton(
            onClick = {
                val browserIntent =
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse(PRIVACY_POLICY_URL)
                    )
                context.getActivity()?.startActivity(browserIntent)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = stringResource(R.string.privacy_policy),
                color = colorResource(id = R.color.purple_500)
            )
        }

        Divider()

        TextButton(
            onClick = {
                //findNavController().navigate(AboutFragmentDirections.actionSettingsToLicense())
            },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = stringResource(R.string.license),
                color = colorResource(id = R.color.purple_500)
            )
        }

        Divider()

    }
}