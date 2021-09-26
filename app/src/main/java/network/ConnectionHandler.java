package network;

import android.app.ProgressDialog;
import android.content.Context;

import com.android.volley.Request;
import com.android.volley.toolbox.HurlStack;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/**
 * Created by Hendry on 11/10/2017.
 */

public class ConnectionHandler {
    ProgressDialog progressDialog;
    HurlStack hurlStack;
    public static final int CONNECTION_TIMEOUT = 1000*90;

    public static final String BASE_URL =  "https://example.com/",
            response_message_success = "success",
            response_message_error = "error",
            response_data = "data",
            response_message = "message",
            response_status = "status";;

    public static int post_method = Request.Method.POST, get_method = Request.Method.GET;
    Context context;
    public ConnectionHandler(Context context){
        this.context = context;
        progressDialog = new ProgressDialog(context);
        hurlStack = new HurlStack() {
            @Override
            protected HttpURLConnection createConnection(URL url) throws IOException {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) super.createConnection(url);
                try {
                    //httpsURLConnection.setSSLSocketFactory(getSSLSocketFactory());
                    //httpsURLConnection.setHostnameVerifier(HttpsURLConnection.getDefaultHostnameVerifier());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return httpsURLConnection;
            }
        };
    }

//    private SSLSocketFactory getSSLSocketFactory()
//            throws CertificateException, KeyStoreException, IOException, NoSuchAlgorithmException, KeyManagementException {
//        CertificateFactory cf = CertificateFactory.getInstance("X.509");
//        InputStream caInput = context.getResources().openRawResource(R.raw.cert); // this cert file stored in \app\src\main\res\raw folder path
//
//        Certificate ca = cf.generateCertificate(caInput);
//        caInput.close();
//
//        KeyStore keyStore = KeyStore.getInstance("BKS");
//        keyStore.load(null, null);
//        keyStore.setCertificateEntry("ca", ca);
//
//        String tmfAlgorithm = TrustManagerFactory.getDefaultAlgorithm();
//        TrustManagerFactory tmf = TrustManagerFactory.getInstance(tmfAlgorithm);
//        tmf.init(keyStore);
//
//        TrustManager[] wrappedTrustManagers = getWrappedTrustManagers(tmf.getTrustManagers());
//
//        SSLContext sslContext = SSLContext.getInstance("TLS");
//        sslContext.init(null, wrappedTrustManagers, null);
//
//        return sslContext.getSocketFactory();
//    }
//    private TrustManager[] getWrappedTrustManagers(TrustManager[] trustManagers) {
//        final X509TrustManager originalTrustManager = (X509TrustManager) trustManagers[0];
//        return new TrustManager[]{
//                new X509TrustManager() {
//                    public X509Certificate[] getAcceptedIssuers() {
//                        return originalTrustManager.getAcceptedIssuers();
//                    }
//
//                    public void checkClientTrusted(X509Certificate[] certs, String authType) {
//                        try {
//                            originalTrustManager.checkClientTrusted(certs, authType);
//                        } catch (CertificateException ignored) {
//                        }
//                    }
//
//                    public void checkServerTrusted(X509Certificate[] certs, String authType) {
//                        try {
//                            originalTrustManager.checkServerTrusted(certs, authType);
//                        } catch (CertificateException ignored) {
//                        }
//                    }
//                }
//        };
//    }
}
