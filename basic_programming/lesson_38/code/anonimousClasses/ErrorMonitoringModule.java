package lesson_38.code.anonimousClasses;

public class ErrorMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг контроля за ошибками в системе стартовал!");
    }
}
