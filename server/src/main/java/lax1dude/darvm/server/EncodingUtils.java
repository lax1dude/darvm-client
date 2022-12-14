/*
 * Copyright (C) 2018 Calder Young
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package lax1dude.darvm.server;

/**
 *
 * @author calder
 */
public class EncodingUtils {
    
    public static byte[] intToBytes(int value) {
        return new byte[] {
            (byte)(value >> 24),
            (byte)(value >> 16),
            (byte)(value >> 8),
            (byte)value};
    }
    
    public static int bytesToInt(byte[] yigg) {
        return (Byte.toUnsignedInt(yigg[0]) << 24) | (Byte.toUnsignedInt(yigg[1]) << 16) | (Byte.toUnsignedInt(yigg[2]) << 8) | (Byte.toUnsignedInt(yigg[3]));
    }
    
}
