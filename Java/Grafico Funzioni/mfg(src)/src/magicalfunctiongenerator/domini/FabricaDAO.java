/**
 * Math function grapher
 *
 * @author Marc Oliveras <admin@oligalma.com> 
 * @link http://www.oligalma.com
 * @copyright 2021 Oligalma
 * @license GPL License v3
 */

package magicalfunctiongenerator.domini;


public class FabricaDAO
{
  private static FabricaDAO instancia = null;
  private IRegistreGrafiques iRegistreGrafiques;

  private FabricaDAO(){}

  public static FabricaDAO instancia()
  {
    if (instancia == null)
      instancia = new FabricaDAO();
    return instancia;
  }

  public IRegistreGrafiques getRegistreGrafiques()
  {
    if (iRegistreGrafiques == null)
      try
      {
        iRegistreGrafiques = (IRegistreGrafiques)Class.forName(System.getProperty("RegistreGrafiques")).newInstance();
      }
      catch (Exception e){}
    return iRegistreGrafiques;
  }
}
