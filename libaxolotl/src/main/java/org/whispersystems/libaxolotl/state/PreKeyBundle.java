package org.whispersystems.libaxolotl.state;

import org.whispersystems.libaxolotl.IdentityKey;
import org.whispersystems.libaxolotl.ecc.ECPublicKey;

/**
 * A class that contains a remote PreKey and collection
 * of associated items.
 *
 * @author Moxie Marlinspike
 */
public class PreKeyBundle {

  private int         registrationId;

  private int        deviceId;

  private int         preKeyId;
  private ECPublicKey preKeyPublic;

  private int         deviceKeyId;
  private ECPublicKey deviceKeyPublic;
  private byte[]      deviceKeySignature;

  private IdentityKey identityKey;

  public PreKeyBundle(int registrationId, int deviceId, int preKeyId, ECPublicKey preKeyPublic,
                      int deviceKeyId, ECPublicKey deviceKeyPublic, byte[] deviceKeySignature,
                      IdentityKey identityKey)
  {
    this.registrationId     = registrationId;
    this.deviceId           = deviceId;
    this.preKeyId           = preKeyId;
    this.preKeyPublic       = preKeyPublic;
    this.deviceKeyId        = deviceKeyId;
    this.deviceKeyPublic    = deviceKeyPublic;
    this.deviceKeySignature = deviceKeySignature;
    this.identityKey        = identityKey;
  }

  /**
   * @return the device ID this PreKey belongs to.
   */
  public int getDeviceId() {
    return deviceId;
  }

  /**
   * @return the unique key ID for this PreKey.
   */
  public int getPreKeyId() {
    return preKeyId;
  }

  /**
   * @return the public key for this PreKey.
   */
  public ECPublicKey getPreKey() {
    return preKeyPublic;
  }

  /**
   * @return the unique key ID for this DeviceKey.
   */
  public int getDeviceKeyId() {
    return deviceKeyId;
  }

  /**
   * @return the device key for this PreKey.
   */
  public ECPublicKey getDeviceKey() {
    return deviceKeyPublic;
  }

  /**
   * @return the signature over the device key.
   */
  public byte[] getDeviceKeySignature() {
    return deviceKeySignature;
  }

  /**
   * @return the {@link org.whispersystems.libaxolotl.IdentityKey} of this PreKeys owner.
   */
  public IdentityKey getIdentityKey() {
    return identityKey;
  }

  /**
   * @return the registration ID associated with this PreKey.
   */
  public int getRegistrationId() {
    return registrationId;
  }
}