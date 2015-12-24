package adapter_pattern;

public class AdapterPatternTesting {
	public static void main(String[] args) {
		EnemyTank enemyTank=new EnemyTank();
		EnemyRobot enemyRobot=new EnemyRobot();
		EnemyAttacker adapter=new EnemyRobotAdapter(enemyRobot);
		adapter.fireWeapon();
		enemyTank.fireWeapon();
	}
}
