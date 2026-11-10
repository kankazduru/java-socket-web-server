package org.example;

public class HtmlContent {
    public static String getPage() {
        return "<html>" +
                "<head>" +
                "<meta charset='UTF-8'>" +
                "<title>Duru Kankaz - Web Sunucusu Ödevi</title>" +
                "<style>" +
                "  body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; background-color: #722F37; color: #333; text-align: center; padding-top: 60px; }" +
                "  .container { background: white; max-width: 650px; margin: 0 auto; padding: 30px; border-radius: 12px; box-shadow: 0 4px 15px rgba(0,0,0,0.2); }" +
                "  h1 { color: #a93226; font-size: 32px; margin-bottom: 5px; }" +
                "  h2 { color: #7f8c8d; font-size: 20px; margin-top: 0; margin-bottom: 25px; }" +
                "  p { font-size: 16px; line-height: 1.7; color: #444; text-align: justify; }" +
                "  .badge { background: #722F37; color: white; padding: 6px 12px; border-radius: 20px; font-size: 14px; display: inline-block; margin-top: 15px; }" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<div class='container'>" +
                "<h1>Duru Kankaz</h1>" +
                "<h2>Öğrenci No: 1250505039</h2>" +
                "<hr style='border: 0; height: 1px; background: #ddd; margin: 20px 0;'>" +
                "<p>" +
                "Kırklareli Üniversitesi Yazılım Mühendisliği 2. sınıf öğrencisiyim. Yazılım geliştirme süreçleri, " +
                "nesne yönelimli programlama (OOP) ve modern web teknolojileri üzerine akademik çalışmalar yürütmekteyim. " +
                "Aynı zamanda Huawei Student Developers (HSD) topluluğunda Core Team üyesi olarak aktif rol alıyor, " +
                "teknik içerikler üretip etkinlik organizasyonlarında yer alıyorum. Teknolojiyi üretken bir şekilde kullanmayı " +
                "ve yeni yazılım mimarileri öğrenmeyi seviyorum." +
                "</p>" +
                "<div class='badge'>Kırklareli Üniversitesi - Yazılım Mühendisliği</div>" +
                "</div>" +
                "</body>" +
                "</html>";
    }
}