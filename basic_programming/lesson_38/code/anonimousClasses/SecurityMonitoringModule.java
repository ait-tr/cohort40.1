package lesson_38.code.anonimousClasses;

public class SecurityMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг контроля безопасности стартовал!");
    }
}
