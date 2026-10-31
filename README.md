<div align="center">

<img src="docs/assets/neo-logo.jpg" width="128" alt="AEmulator Neo logo"/>

# AEmulator Neo

**A fork of [AEmulator Plus](https://github.com/somerandomusernam2/AEmulator-Plus) which is a fork of [AEmulator Sunset](https://github.com/drel4/AEmulator-Sunset) which is a fork of [AEmulator](https://github.com/uxazu/AEmulator) with mostly new customization and QoL features.

**🇬🇧 English** · [🇵🇱 Polski](docs/i18n/README.pl.md) 

</div>

---

AEmulator Neon boots a real Android 1.0–17 system image straight from a firmware file you already have. It translates the old ARM code with a patched QEMU, emulates the kernel’s binder, draws with your phone’s GPU and plays sound through Android’s audio stack - everything runs inside a normal app. This project was made almost entirely with the help of various AIs (and the original aemu with Opus 5.5).

## Features

- Import almost any firmware format: Android-x86 `.iso`, CWM/TWRP ZIP, Samsung Odin `.tar.md5`, Google factory `.tgz`, `system.img`, OTA `system.new.dat.br`, Motorola `.sbf`, sparse images, EDL images, Spreadtrum `.pac`, HTC `.nbh`, HTC `RUU.exe`, and many other formats
- Vendor skins work as shipped if compatible: HTC Sense, Samsung TouchWiz, MIUI, AOSP
- Hardware graphics through the GL bridge, sound, touch and multitouch, network with a modern TLS proxy
- Shared memory-card folder for APKs, music and photos
- **VM screen themes and theme editor**: the navigation bar and the frame around the guest screen follow a theme — Original, Sunset, Gingerbread 2.x, Honeycomb 3.x, Holo 4.x or Lollipop 5.x — or your own, made in an editor with a live preview (key shapes and size, bar/key/pressed/frame colours, glow and halo, floating or flat bar, frame picture, rounded screen corners). Themes can be shared as `.aetheme` files. App settings › Appearance › VM screen theme.
- Material 3 Expressive interface in 19 languages
- Free and open source (GPL-3.0)

## Quick start

1. Download the APK from [Releases](https://github.com/SzymekTymek991plus81/AEmulator-neo/releases) and install it.
2. Open AEmulator Neo → **Add firmware** and pick the file. Import takes a few minutes.
3. Press **Start**. The first boot is slower: the system optimises its apps.
4. Use the ⋮ menu for volume, power button and logs; the ⚙️ button opens app settings and language.

## Requirements

- Android 8.0+ on a 64-bit ARM phone (arm64-v8a)
- About 500MB–8 GB of free space per firmware
- A Snapdragon SoC is recommended, other should also work tho

## Credits

[HoloHCL](https://github.com/TheTechnoLegacy/HoloHCL) - I didn't actually used the theme, but I was inspired to add the Honeycomb theme by it, so I don't have do credit it, but it's great so i'll credit it anyways.

## License

GPL-3.0. Android, trademarks and firmware belong to their owners.

See [dated modification notices](NOTICE.md) and the [outstanding source/licensing audit](docs/license-audit.md). The GPL label is not a certification that every bundled prebuilt has complete matching source.
