#!/usr/bin/env bash
set -euo pipefail

repo_root="$(cd "$(dirname "$0")/.." && pwd)"
base_url="https://raw.githubusercontent.com/dracula/jetbrains/master/src/main/resources/themes"

curl -fsSL "$base_url/DraculaColorful.xml" -o "$repo_root/resources/theme/upstream/DraculaColorful.xml"
curl -fsSL "$base_url/DraculaColorful.theme.json" -o "$repo_root/resources/theme/upstream/DraculaColorful.theme.json"
curl -fsSL "$base_url/IslandsDraculaColorful.theme.json" -o "$repo_root/resources/theme/upstream/IslandDraculaColorful.theme.json"


printf 'Synced upstream Dracula Colorful resources.\n'
