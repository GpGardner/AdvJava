/**
 * Enemy interface, all enemies will be coded against this
 * to allow for dynamic injection at runtime
 */

public interface IEnemy {
	
	
	void attack();
	void speak();

}
