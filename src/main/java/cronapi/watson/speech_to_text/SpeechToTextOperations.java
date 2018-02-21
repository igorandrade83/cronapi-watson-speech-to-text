package cronapi.watson.speech_to_text;

import com.ibm.watson.developer_cloud.speech_to_text.v1.SpeechToText;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.*;
import com.ibm.watson.developer_cloud.speech_to_text.v1.websocket.RecognizeCallback;
import cronapi.CronapiMetaData;
import okhttp3.WebSocket;

import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@CronapiMetaData
public final class SpeechToTextOperations {

  @CronapiMetaData
  public static void addCorpus(String username, String password, String endPoint, Map<String, String> headers,
                               String customizationId, String corpusName, File corpusFile, Boolean allowOverwrite) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.addCorpus(customizationId, corpusName, corpusFile, allowOverwrite).execute();
  }

  @CronapiMetaData
  public static void addWord(String username, String password, String endPoint, Map<String, String> headers,
                             String customizationId, Word word) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.addWord(customizationId, word).execute();
  }

  @CronapiMetaData
  public static void addWords(String username, String password, String endPoint, Map<String, String> headers,
                              String customizationId, Word... words) {

    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.addWords(customizationId, words).execute();
  }

  @CronapiMetaData
  public static Customization createCustomization(String username, String password, String endPoint, Map<String, String> headers,
                                                  String name, SpeechModel baseModel, String description, String dialect) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createCustomization(name, baseModel, description, dialect).execute();
  }

  @CronapiMetaData
  public static Customization createCustomization(String username, String password, String endPoint, Map<String, String> headers,
                                                  String name, SpeechModel baseModel, String description) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createCustomization(name, baseModel, description).execute();
  }

  @CronapiMetaData
  public static RecognitionJob createRecognitionJob(String username, String password, String endPoint, Map<String, String> headers,
                                                    File audio, RecognizeOptions recognizeOptions, RecognitionJobOptions recognitionJobOptions) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createRecognitionJob(audio, recognizeOptions, recognitionJobOptions).execute();
  }

  @CronapiMetaData
  public static SpeechSession createSession(String username, String password, String endPoint, Map<String, String> headers) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createSession().execute();
  }

  @CronapiMetaData
  public static SpeechSession createSession(String username, String password, String endPoint, Map<String, String> headers,
                                            SpeechModel model) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createSession(model).execute();
  }

  @CronapiMetaData
  public static void deleteCorpus(String username, String password, String endPoint, Map<String, String> headers,
                                  String customizationId, String corpusName) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteCorpus(customizationId, corpusName).execute();
  }

  @CronapiMetaData
  public static void deleteCustomization(String username, String password, String endPoint, Map<String, String> headers,
                                         String customizationId) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteCustomization(customizationId).execute();
  }

  @CronapiMetaData
  public static void deleteRecognitionJob(String username, String password, String endPoint, Map<String, String> headers,
                                          String id) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteRecognitionJob(id).execute();
  }

  @CronapiMetaData
  public static void deleteSession(String username, String password, String endPoint, Map<String, String> headers,
                                   SpeechSession session) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteSession(session).execute();
  }

  @CronapiMetaData
  public static void deleteWord(String username, String password, String endPoint, Map<String, String> headers,
                                String customizationId, String wordName) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteWord(customizationId, wordName).execute();
  }

  @CronapiMetaData
  public static List<Corpus> getCorpora(String username, String password, String endPoint, Map<String, String> headers,
                                        String customizationId) {

    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getCorpora(customizationId).execute();
  }

  @CronapiMetaData
  public static Corpus getCorpus(String username, String password, String endPoint, Map<String, String> headers,
                                 String customizationId, String corpusName) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getCorpus(customizationId, corpusName).execute();
  }

  @CronapiMetaData
  public static Customization getCustomization(String username, String password, String endPoint, Map<String, String> headers,
                                               String customizationId) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getCustomization(customizationId).execute();
  }

  @CronapiMetaData
  public static List<Customization> getCustomizations(String username, String password, String endPoint, Map<String, String> headers,
                                                      String language) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getCustomizations(language).execute();
  }

  @CronapiMetaData
  public static SpeechModel getModel(String username, String password, String endPoint, Map<String, String> headers,
                                     String modelName) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getModel(modelName).execute();
  }

  @CronapiMetaData
  public static List<SpeechModel> getModels(String username, String password, String endPoint, Map<String, String> headers) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getModels().execute();
  }

  @CronapiMetaData
  public static RecognitionJob getRecognitionJob(String username, String password, String endPoint, Map<String, String> headers,
                                                 String id) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getRecognitionJob(id).execute();
  }

  @CronapiMetaData
  public static List<RecognitionJob> getRecognitionJobs(String username, String password, String endPoint, Map<String, String> headers) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getRecognitionJobs().execute();
  }

  @CronapiMetaData
  public static SpeechSessionStatus getRecognizeStatus(String username, String password, String endPoint, Map<String, String> headers,
                                                       SpeechSession session) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getRecognizeStatus(session).execute();
  }

  @CronapiMetaData
  public static WordData getWord(String username, String password, String endPoint, Map<String, String> headers,
                                 String customizationId, String wordName) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getWord(customizationId, wordName).execute();
  }

  @CronapiMetaData
  public static List<WordData> getWords(String username, String password, String endPoint, Map<String, String> headers,
                                        String customizationId, Word.Type type) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getWords(customizationId, type).execute();
  }

  @CronapiMetaData
  public static List<WordData> getWords(String username, String password, String endPoint, Map<String, String> headers,
                                        String customizationId, Word.Type type, Word.Sort sort) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getWords(customizationId, type, sort).execute();
  }

  @CronapiMetaData
  public static SpeechResults recognize(String username, String password, String endPoint, Map<String, String> headers,
                                        File audio) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.recognize(audio).execute();
  }

  @CronapiMetaData
  public static SpeechResults recognize(String username, String password, String endPoint, Map<String, String> headers,
                                        File audio, RecognizeOptions options) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.recognize(audio, options).execute();
  }

  @CronapiMetaData
  public static WebSocket recognizeUsingWebSocket(String username, String password, String endPoint, Map<String, String> headers,
                                                  InputStream audio, RecognizeOptions options, RecognizeCallback callback) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.recognizeUsingWebSocket(audio, options, callback);
  }

  @CronapiMetaData
  public static RecognitionCallback registerCallback(String username, String password, String endPoint, Map<String, String> headers,
                                                     String callbackUrl, String secret) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.registerCallback(callbackUrl, secret).execute();
  }

  @CronapiMetaData
  public static void resetCustomization(String username, String password, String endPoint, Map<String, String> headers,
                                        String customizationId) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.resetCustomization(customizationId).execute();
  }

  @CronapiMetaData
  public static void trainCustomization(String username, String password, String endPoint, Map<String, String> headers,
                                        String customizationId, Customization.WordTypeToAdd wordTypeToAdd) {
    SpeechToText service = new SpeechToText();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.trainCustomization(customizationId, wordTypeToAdd).execute();
  }
}
