import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GradleDigestUtils {
    private static final String MD5_DIGEST = "MD5";
    private static final Pattern VERSION_PATTERN = Pattern.compile("^(.*?)-(src|bin|all)$");
    private static final String GRADLE_DOWNLOAD_URL = "https://services.gradle.org/distributions/gradle-%s.zip";

    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            String input = args[0].trim();
            Matcher matcher = VERSION_PATTERN.matcher(input);
            if (matcher.matches()) {
                String url = String.format(GRADLE_DOWNLOAD_URL, input);
                MessageDigest messageDigest = MessageDigest.getInstance(MD5_DIGEST);
                messageDigest.update(url.getBytes(StandardCharsets.UTF_8));
                String digest = new BigInteger(1, messageDigest.digest()).toString(36);
                System.out.println(digest);
            } else {
                System.out.println("Error: Version pattern error!");
                System.exit(-1);
            }
        } else {
            System.out.println("Error: Needs gradle version!");
            System.exit(-1);
        }
    }
}