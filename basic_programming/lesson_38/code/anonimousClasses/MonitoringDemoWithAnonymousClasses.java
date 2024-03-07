package lesson_38.code.anonimousClasses;

public class MonitoringDemoWithAnonymousClasses {
    public static void main(String[] args) {

        MonitoringSystem generalModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг основных показателей стартовал!");
            }
        };

        MonitoringSystem errorModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Мониторинг контроля за ошибками в системе стартовал!");
            }
        };

        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                    System.out.println("Мониторинг контроля безопасности стартовал!");
                }
            };

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();

        }
}
