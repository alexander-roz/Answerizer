import java.util.*;

public class Prediction {

    private static final String a1 = "БЕССПОРНО";
    private static final String a2 = "ПРЕДРЕШЕНО";
    private static final String a3 = "НИКАКИХ СОМНЕНИЙ";
    private static final String a4 = "ОПРЕДЕЛЕННО ДА";
    private static final String a5 = "Можешь быть уверен в этом";
    private static final String a6 = "МНЕ КАЖЕТСЯ ДА";
    private static final String a7 = "ВЕРОЯТНЕЕ ВСЕГО";
    private static final String a8 = "Хорошие перспективы";
    private static final String a9 = "ЗНАКИ ГОВОРЯТ ДА";
    private static final String a10 = "ДА";
    private static final String a11 = "Пока не ясно, пробуй снова";
    private static final String a12 = "СПРОСИ ПОЗЖЕ";
    private static final String a13 = "Лучше не рассказывать";
    private static final String a14 = "Сейчас нельзя предсказать";
    private static final String a15 = "Сконцентрируйся и спроси опять";
    private static final String a16 = "ДАЖЕ НЕ ДУМАЙ";
    private static final String a17 = "НЕТ";
    private static final String a18 = "По моим данным НЕТ";
    private static final String a19 = "Перспективы не очень хорошие";
    private static final String a20 = "Весьма сомнительно";

    public static String getPrediction() {
        String [] list = new String[]{
                a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20
        };
        Random random = new Random();
        int index = random.nextInt(list.length);
        if (index > 0)
        return list[index];
        else return a11;
        }
    }
