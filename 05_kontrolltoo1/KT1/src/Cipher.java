public class Cipher {
    public static String nihuta(String lause, int nihe) {
        StringBuilder cipherLause = new StringBuilder();

        for(int i = 0; i < lause.length(); i++){
            char character = lause.charAt(i);

            if (Character.isLetter(character)) {
                char cipherCharacter = (char) (character + nihe);
                if (Character.isLowerCase(character)) && cipherCharacter > 'z') || (Character.isUpperCase(character)) && cipherCharacter > 'Z' )){
                    cipherCharacter -= 26;
                }
                cipherLause.append(cipherCharacter);
            } else {
                cipherLause.append(character);
            }
        }
    }
    return cipherLause.toString();
}
