package adapter_pattern;

//client will be working with
//adapter will create new class compatible with this
public interface EnemyAttacker {
	void fireWeapon();
	void driveForward();
	void assignDriver(String name);

}
