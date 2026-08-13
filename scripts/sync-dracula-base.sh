#!/usr/bin/env bash
set -euo pipefail

repo_root="$(cd "$(dirname "$0")/.." && pwd)"
tag="${1:-$(gh release view --repo dracula/jetbrains --json tagName -q .tagName 2>/dev/null || echo "master")}"
base_url="https://raw.githubusercontent.com/dracula/jetbrains/${tag}/src/main/resources/themes"

printf 'Syncing upstream Dracula Colorful resources from %s...\n' "$tag"
curl -fsSL "$base_url/DraculaColorful.xml" -o "$repo_root/upstream/DraculaColorful.xml"
curl -fsSL "$base_url/DraculaColorful.theme.json" -o "$repo_root/upstream/DraculaColorful.theme.json"
curl -fsSL "$base_url/IslandsDraculaColorful.theme.json" -o "$repo_root/upstream/IslandDraculaColorful.theme.json"

printf 'Synced upstream Dracula Colorful resources (%s).\n' "$tag"

